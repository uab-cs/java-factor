import java.util.Scanner;

public class Factorization {

	public static double[] solvea(double a[][], int cishu) {
         
		int q = factor((int) (a[0][0])).length;

		for (int j = 0; j < q; j++) {
			System.out.println(factor((int) (a[0][0]))[j]);
		}

		System.out.println("abc"+a[a.length-cishu][0]);
		int g = factor((int) (a[a.length - cishu][0])).length;
	

		for (int b = 0; b < g; b++) {
			System.out.println(factor((int) (a[a.length - cishu][0]))[b]);
		}

		double f[] = new double[q];

		for (int i = 0; i < q; i++) {
			f[i] = factor((int) a[0][0])[i];
		}

		

		double vf[] = new double[q];

		double k[] = new double[g];

		for (int i = 0; i < g; i++) {
			k[i] = factor((int) a[a.length - cishu][0])[i];
		}

		

		double vk[] = new double[g];

		for (int j = 0; j < q; j++) {

			vf[j] = f[j] * -1;
			System.out.println(vf[j]);

		}
		for (int i = 0; i < g; i++) {

			vk[i] = k[i] * -1;
			System.out.println(vk[i]);

		}

		int bl = g * q * 2;

		int tokena = 0;

		int tokenb = 0;

		double ex[] = new double[bl];

		while (tokena < q) {

			for (int i = 0; i < g; i++) {

				ex[tokenb] = k[i] / f[tokena];
				System.out.println(ex[tokenb]);

				tokenb++;
			}
			tokena++;
		}
		// the upper code: The array ex includes at least one of the possible root of
		// the first given equation.
		int nos = 0;

		for (int i = 0; i < ex.length; i++) {

			if (calculation1(a, ex[i]) == 0) {

				nos++;

			}

		}

		System.out.println(nos);

		double solve[] = new double[nos];

		int index = 0;

		System.out.println("all the root possible in the first equation are:");

		for (int i = 0; i < ex.length; i++) {

			if (calculation1(a, ex[i]) == 0) {

				solve[index] = ex[i];

				System.out.println(solve[index]);

				index++;

			}

		}

		return solve;

	}

	public static double[][] newequation(int[][] a, double b) {

		double[][] nq = new double[a.length][2];

		nq[0][0] = a[0][0];

		for (int i = 0; i < a.length - 1; i++) {

			nq[i + 1][0] = nq[i][0] * b + a[i + 1][0];

			nq[i][1] = a[i][1] - 1;

			System.out.println(nq[i][0]);
			System.out.println(nq[i][1]);
		}

		return nq;

	}

	public static double calculation(int[][] a, double b) {

		double sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + (double) a[i][0] * Math.pow(b, (double) a[i][1]);

			// System.out.println(sum);
		}

		return sum;
	}

	public static int[] factor(int a) {

		int token = 0;

		for (int i = 1; i <= Math.abs(a); i++) {

			if (a % i == 0) {

				token++;

			}
		}

		int p = 0;

		int[] fact = new int[token];

		for (int j = 1; j <= Math.abs(a); j++) {

			if (a % j == 0) {

				fact[p] = j;
				p++;
			}
		}
		return fact;
	}

	public static double calculation1(double[][] a, double b) {

		double sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i][0] * Math.pow(b, (double) a[i][1]);

			// System.out.println(sum);
		}

		return sum;
	}

	public static void main(String[] args) {

		// Scanner main = new Scanner(System.in);
		// String input = main.next();

		// for (int k = 0; k < input.length(); k++) {
		// }

		// System.out.println(input);

		int M = 6;
		int[][] Z;

		Z = new int[M][2];

		Z[0][0] = 10;
		Z[0][1] = 5;
		Z[1][0] = 86;
		Z[1][1] = 4;
		Z[2][0] = 158;
		Z[2][1] = 3;
		Z[3][0] = -254;
		Z[3][1] = 2;
		Z[4][0] = -792;
		Z[4][1] = 1;
		Z[5][0] = -360;
		Z[5][1] = 0;

		int q = factor(Z[0][0]).length;

		for (int j = 0; j < q; j++) {
			System.out.println(factor(Z[0][0])[j]);
		}

		// int g = factor(Math.abs(Z[5][0])).length;

		// System.out.println (Z[5][0]);
		int g = factor(Z[5][0]).length;
		// System.out.println(g);

		for (int b = 0; b < g; b++) {
			System.out.println(factor(Z[5][0])[b]);
		}

		double f[] = new double[q];

		for (int i = 0; i < q; i++) {
			f[i] = factor(Z[0][0])[i];
		}

		// int f[] = factor(Z[0][0]);

		double vf[] = new double[q];

		double k[] = new double[g];

		for (int i = 0; i < g; i++) {
			k[i] = factor(Z[5][0])[i];
		}

		// int k[] = factor(Z[5][0]);

		double vk[] = new double[g];

		for (int j = 0; j < q; j++) {

			vf[j] = f[j] * -1;
			System.out.println(vf[j]);

		}
		for (int i = 0; i < g; i++) {

			vk[i] = k[i] * -1;
			System.out.println(vk[i]);

		}

		int bl = g * q * 2;

		int tokena = 0;

		int tokenb = 0;

		double ex[] = new double[bl];

		while (tokena < q) {

			for (int i = 0; i < g; i++) {

				ex[tokenb] = k[i] / f[tokena];
				System.out.println(ex[tokenb]);

				tokenb++;
			}
			tokena++;
		}
		// the upper code: The array ex includes at least one of the possible root of
		// the first given equation.
		int nos = 0;

		for (int i = 0; i < ex.length; i++) {

			if (calculation(Z, ex[i]) == 0) {

				nos++;

			}

		}

		System.out.println(nos);

		double solve[] = new double[nos];

		int index = 0;

		System.out.println("all the root possible in the first equation are:");

		for (int i = 0; i < ex.length; i++) {

			if (calculation(Z, ex[i]) == 0) {

				solve[index] = ex[i];

				System.out.println(solve[index]);

				index++;

			}

		}

		// The upper code and array solve[] arranges all the root that is correct for
		// the first equation.

		System.out.println("the new equation is here:");

		newequation(Z, solve[0]);

		
		
		
		System.out.println(solvea(newequation(Z,solve[0]),2)[0]);
		
		
		
		// System.out.println(calculation(Z, 2));

		// System.out.println("Enter a positive integer:");
		// Scanner sc = new Scanner(System.in);
		// Long n = sc.nextLong();
		// long m=n;

		// for (int i=1 ;i<=m; i++ ) {

		// if( m % i ==0) {

		// System.out.println(i);

		// }

		// }

	}
}
