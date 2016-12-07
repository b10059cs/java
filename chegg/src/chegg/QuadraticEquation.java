package chegg;

import java.util.Scanner;

public class QuadraticEquation {

	Scanner input = new Scanner(System.in);
	/* necessary variable declaration */
	private double coefficientA;// for quadratic term coefficient
	private double coefficientB;// for linear term coefficient
	private double constantTerm;// for constant term

	private double as;// for symmetric
	private double yi;// for y-intercept
	private double xi;// for x-intercept
	private double xi1;
	private double xi2;

	private double dis;// for Discriminant
	private double vx;// for vertex x
	private double vy;// for vertex y

	private double x1;// for roots
	private double x2;// for roots

	public void readData() {
		System.out.println("Enter the cofficient of the quadratic term");
		coefficientA = input.nextDouble();
		System.out.println("Enter the cofficient of the linear term");
		coefficientB = input.nextDouble();
		System.out.println("Enter the constant term");
		constantTerm = input.nextDouble();
	}

	public void axisSym() {
		as = ((-coefficientB)) / (2 * coefficientA);
		System.out.println("Axis of Symmetry: x = " + as);
	}

	public void getYintercept() {
		/*
		 * Note that for any point on the y-axis the value of x for that point
		 * is zero.
		 */
		yi = constantTerm;
		System.out.println("y-intercept: (" + new Double(0) + ", " + yi + ")");
	}

	public void getDiscriminant() {
		/* Discriminant is given by b^2-4ac */
		dis = (coefficientB * coefficientB) - (4 * coefficientA * constantTerm);
		System.out.println("Discriminant: " + dis);
	}

	public void getXintercept() {
		if (dis < 0) {
			System.out.println("x-intercepts: none");
		} else {
			if (dis == 0) {
				xi = (-coefficientB) + Math.sqrt(dis) / (2 * coefficientA);
				System.out.println("x-intercept: (" + xi + ", " + new Double(0 + ")"));
			} else if (dis > 0) {
				xi1 = (-coefficientB) + Math.sqrt(dis) / (2 * coefficientA);
				xi2 = (-coefficientB) - Math.sqrt(dis) / (2 * coefficientA);
				System.out.println("x-intercept: " + xi1 + " and  " + xi2 + "");

			}
		}
	}

	public void getVertex() {
		vx = as;
		vy = coefficientA * as * as + coefficientB * as + constantTerm;
		System.out.println("Vertex: (" + vx + ", " + vy + ")");
	}

	public void getRoots() {
		if (dis > 0) {
			x1 = (-coefficientB + Math.sqrt(dis)) / (2 * coefficientA);
			x2 = (-coefficientB - Math.sqrt(dis)) / (2 * coefficientA);
			System.out.println("Roots: x (" + x1 + ", " + x2 + ")");
		}

		else if (dis == 0) {
			x1 = (-coefficientB + Math.sqrt(dis)) / (2 * coefficientA);
			System.out.println("Roots: x (" + x1 + ", " + x1 + ")");
		}

		else {
			x1 = -coefficientB / (2 * coefficientA);
			x2 = Math.sqrt(-dis) / (2 * coefficientA);

			System.out.println("Roots: x (" + x1 + "+" + x2 + "i, " + x1 + "-" + x2 + "i)");
		}
	}

	public void printEquation() {
		String equ = "";
		if (coefficientB > 0) {
			equ += "+" + coefficientB + "x";
		} else {
			equ += coefficientB + "x";
		}
		if (constantTerm > 0) {
			equ += "+" + constantTerm;
		} else {
			equ += constantTerm;
		}
		System.out.println("For the quadratic equation " + coefficientA + "x^2" + equ);
	}

	public static void main(String args[]) {
		/*class object creation*/
		QuadraticEquation equation = new QuadraticEquation();
		/*method calling*/
		equation.readData();
		equation.printEquation();
		equation.getDiscriminant();
		equation.getRoots();
		equation.axisSym();
		equation.getVertex();
		equation.getXintercept();
		equation.getYintercept();

	}

}
