public class VerifyIdNumber {
    // 校验IdCardNumber
    public static boolean verifyIdCardNumber(String idCardNumber) {
        if (idCardNumber.length() == 18) {
            return verify18IdCardNumber(idCardNumber);
        } else if (idCardNumber.length() == 15) {
            return verify15IdCardNumber(idCardNumber);
        } else {
            return false;
        }
    }

    // 校验15位身份证号码
    public static boolean verify15IdCardNumber(String idCardNumber) {
        // 如果身份证顺序码是996 997 998 999，这些是为百岁以上老人的特殊编码
        if (idCardNumber.equals("996") || idCardNumber.equals("997") || idCardNumber.equals("998") || idCardNumber.equals("999")) {
            return true;
        } else {
            // 将15位身份证号码转换为18位
            idCardNumber = idCardNumber.substring(0, 6) + "19" + idCardNumber.substring(6, 15);
            // 将18位身份证号码的第17位转换为X
            idCardNumber = idCardNumber.substring(0, 17) + "X";
            return verify18IdCardNumber(idCardNumber);
        }
    }

    // 校验18位身份证号码
    public static boolean verify18IdCardNumber(String idCardNumber) {
        // 非18位为假
        if (idCardNumber.length() != 18) {
            return false;
        }
        // 取出前17位
        String idCardNumber17 = idCardNumber.substring(0, 17);
        // 取出最后一位
        String idCardNumber18Code = idCardNumber.substring(17, 18);
        // 前17位全部为数字
        if (isDigital(idCardNumber17)) {
            // 获取校验位
            String idCardNumber18CodeCalc = getIdCardNumber18Code(idCardNumber17);
            // 前17位和第18位校验验证
            return idCardNumber18Code.toUpperCase().equals(idCardNumber18CodeCalc);
        }
        return false;
    }

    // 将身份证的每位和对应位的加权因子相乘之后，再得到和值
    public static int getPowerSum(String idCardNumber) {
        int powerSum = 0;
        for (int i = 0; i < idCardNumber.length(); i++) {
            // 将字符转为数字
            int t = Integer.parseInt(String.valueOf(idCardNumber.charAt(i)));
            // 位数和对应位数的加权因子相乘之后，再得到和值
            powerSum += t * POWER_ARRAY[i];
        }
        return powerSum;
    }

    // 将和值与11取模得到余数进行校验码判断
    public static String getIdCardNumber18Code(String idCardNumber17) {
        int powerSum = getPowerSum(idCardNumber17);
        // 将和值与11取模得到余数进行校验码判断
        String idCardNumber18CodeCalc = ID_CARD_NUMBER_ARRAY[powerSum % 11];
        return idCardNumber18CodeCalc;
    }

    // 判断字符串是否为数字
    public static boolean isDigital(String str) {
        return str.matches("^[0-9]*$");
    }

    // 加权因子
    public static int[] POWER_ARRAY = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    // 校验码数组
    public static String[] ID_CARD_NUMBER_ARRAY = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};

    public static void main(String[] args) {
        System.out.println(verifyIdCardNumber("431126200007240039"));
    }
}