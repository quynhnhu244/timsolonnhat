package timsolonnhat.nhu;
import java.util.*;
public class timsolonnhatwhile {
	public static void main(String[] args) {
		int n, i = 0;
		float array[] = new float[50];
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		n = nhap.nextInt();
		for (int a=0;a<n;a++)
		  {
		   System.out.println("Nhap phan tu thu "+a+" cua mang: ");
		   array[a] = nhap.nextInt();
		  }
		float max = array[0];
		while (i<n) {
			if (max < array[i]) {
				max = array[i];
			}
			i++;
		}
		System.out.println("So lon nhat la: " + max);
	}
}
