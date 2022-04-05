import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("Nhap so phaan u trong mang");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" gia tri cua phan tu: " + (i + 1));
            arr[i] = sc.nextDouble();
           }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum= (int) (sum+arr[i]);
            }
         }
        System.out.println("Tong cac phan tu chan la:"+ sum);

//---------------------------
        System.out.println("Nhap vao a");
        int a= sc.nextInt();
             for(int i=0;i< arr.length;i++){
                 if(arr[i]==(a)){
                     System.out.println("Vi tri cua a"+ i);
                 }
             }
        int i;
        int c;
        System.out.println("Nhap so x can so: ");
        int x = sc.nextInt();
        for (c=i = 0; i < n; i++) {

            if (arr[i] != x) {
                arr[c] = arr[i];
                c++;
            }
        }
        n=c;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + x + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
        //---------------------Nhap vao b them b vao,vitri--------
//        int[] a = {5,7,8,9,10};


        int[] b =new int[6];
        for (i = 0; i < arr.length; i++) {
            if(i<5){
                b[i]= (int) arr[i];
            }
            b[5]=15;
        }

        System.out.println("\nArray after adding element is: ");
        for ( i = 0; i < 6; i++) {
            System.out.print(b[i] +" ");
        }





        }
    }
