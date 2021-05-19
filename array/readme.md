# Array

## Vấn đề phát sinh khi không có Array

## Array là gì ? có điểm gì đặc biệt ? 
- Là 1 tập hợp các giá trị có `cùng kiểu dữ liệu` 
- `Độ dài của Array` phải được xác định ngay `khi khởi tạo`
- `Không thể thay đổi độ dài (thêm/bớt) của Array` sau khi đã khởi tạo xong

## Cách khởi tạo 1 Array
- Cách 1: <kiểu-dữ-liệu> `[]` <tên-mảng> = `new` <kiểu dữ liệu> `[`<độ-dài-của-mảng>`]`
  - Ví dụ: int[] array = new int[3]

- Cách 2: <kiểu-dữ-liệu> <tên-mảng>`[]` = `new` <kiểu dữ liệu> `[`<độ-dài-của-mảng>`]`
  - Ví dụ: int array[] = new int[3]
   
- Cách 3: <kiểu-dữ-liệu> `[]` <tên-mảng> = `{` <giá-trị-phần-tử-thứ-0>, <giá-trị-phần-tử-thứ-1>, <giá-trị-phần-tử-thứ-2>`]`
  - Ví dụ: int[] array = {1,2,3}

- Cách 4: <kiểu-dữ-liệu> <tên-mảng>`[]` = `{` <giá-trị-phần-tử-thứ-0>, <giá-trị-phần-tử-thứ-1>, <giá-trị-phần-tử-thứ-2>`]`
  - Ví dụ: int array[] = {1,2,3}

## Giá trị default của các phần tử trong Array 
- Sau khi khởi tạo xong, tùy thuộc vào kiểu dữ liệu của mảng mà giá trị default là gì.
- Ví dụ: 
  + `int[] integerArray = new int[5]` => tất cả các phần tử có giá trị bằng `0`
  + `float[] floatArray = new float[5]` => tất cả các phần tử có giá trị bằng `0.0`
  + `String[] stringArray = new String[5]` => tất cả các phần tử có giá trị `null`

## Gán/sửa giá trị như thế nào
- Để gán gía trị cho các phần tử của mảng, ta cần biết chính xác `index` của phần tử đó.
- `index`: luôn bắt đầu bằng 0 với phần tử đứng đầu mảng, các phần tử kế tiếp sẽ được đánh số index tăng dần.
- Ví dụ:
  ```java
  // tạo 1 mảng có 3 phần tử, giá trị của mỗi phần tử tương ứng là 1, 2, 3
  int[] array = new int[3];
  array[0] = 1;
  array[1] = 2;
  array[2] = 3;
  ```

## Duyệt tất cả các phần tử trong mảng
- Duyệt các phần tử trong mảng ta cũng dựa vào `index`.
- Duyệt 3 phần tử của mảng
```java
  // không dùng loop
  // tạo 1 mảng có 3 phần tử, giá trị của mỗi phần tử tương ứng là 1, 2, 3
  int[] array = new int[3];
  array[0] = 1;
  array[1] = 2;
  array[2] = 3;
  // in ra từng phần tử của mảng
  int index = 0; // khai báo và khởi tạo index = 1, để bắt đầu duyệt phần tử đầu tiên
  System.out.println(array[index] + "");

  index = index + 1; // tăng index lên 1, để duyệt phần tử tiếp theo 
  System.out.println(array[index] + "");

  index = index + 1; // tăng index lên 1, để duyệt phần tử tiếp theo.
  System.out.println(array[index] + "");

  ```

```java
  // Dùng for loop
  // tạo 1 mảng có 3 phần tử, giá trị của mỗi phần tử tương ứng là 1, 2, 3
  int[] array = new int[3];
  array[0] = 1;
  array[1] = 2;
  array[2] = 3;
  // in ra từng phần tử của mảng
  for(int index = 0; index < array.length - 1; index++){
    System.out.println(array[index] + "");
  }

  ```