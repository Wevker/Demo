public class E {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

  // 快速排序
  public static void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private static void quickSort(int[] arr, int left, int right) {
    if (left >= right) {
      return;
    }
    int pivot = arr[left];
    int l = left;
    int r = right;
    while (l < r) {
      while (l < r && arr[r] >= pivot) {
        r--;
      }
      arr[l] = arr[r];
      while (l < r && arr[l] <= pivot) {
        l++;
      }
      arr[r] = arr[l];
    }
    arr[l] = pivot;
    quickSort(arr, left, l - 1);
    quickSort(arr, l + 1, right);
  }

  // 归并排序
  public static void mergeSort(int[] arr) {
    mergeSort(arr, 0, arr.length - 1);
  }

  private static void mergeSort(int[] arr, int left, int right) {
    if (left >= right) {
      return;
    }
    int mid = left + (right - left) / 2;
    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);
    merge(arr, left, mid, right);
  }

  private static void merge(int[] arr, int left, int mid, int right) {
    int[] tmp = new int[right - left + 1];
    int i = left;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= right) {
      if (arr[i] <= arr[j]) {
        tmp[k++] = arr[i++];
      } else {
        tmp[k++] = arr[j++];
      }
    }
    while (i <= mid) {
      tmp[k++] = arr[i++];
    }
    while (j <= right) {
      tmp[k++] = arr[j++];
    }
    for (int t = 0; t < tmp.length; t++) {
      arr[left + t] = tmp[t];
    }
  }

  // 堆排序
  public static void heapSort(int[] arr) {
    for (int i = arr.length / 2 - 1; i >= 0; i--) {
      heapAdjust(arr, i, arr.length);
    }
    for (int i = arr.length - 1; i > 0; i--) {
      swap(arr, 0, i);
      heapAdjust(arr, 0, i);
    }
  }

  private static void heapAdjust(int[] arr, int i, int length) {
    int tmp = arr[i];
    int child = 2 * i + 1;
    while (child < length) {
      if (child + 1 < length && arr[child + 1] > arr[child]) {
        child++;
      }
      if (tmp >= arr[child]) {
        break;
      }
      arr[i] = arr[child];
      i = child;
      child = 2 * i + 1;
    }
    arr[i] = tmp;
  }
  public static void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}