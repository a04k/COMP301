public class Complex {
  private double real;
  private double imaginary;

  public Complex() {
    this(0, 0);
  }

  public Complex(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  // setters and getters
  public void setReal(double real) {
    this.real = real;
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  // Methods
  public boolean isReal() {
    return imaginary == 0;
  }

  public boolean isImaginary() {
    return real == 0;
  }

  public boolean equals(Complex c) {
    return this.real == c.real && this.imaginary == c.imaginary;
  }

  public Complex addTo(Complex c) {
    return new Complex(this.real + c.real, this.imaginary + c.imaginary);
  }

  public Complex multiplyTo(Complex c) {
    double newReal = this.real * c.real - this.imaginary * c.imaginary;
    double newImaginary = this.real * c.imaginary + this.imaginary * c.real;
    return new Complex(newReal, newImaginary);
  }

  public Complex conjugate() {
    return new Complex(this.real, -this.imaginary);
  }

  public double magnitude() {
    return Math.sqrt(real * real + imaginary * imaginary);
  }

  public void display() {
    System.out.println(real + (imaginary >= 0 ? "+" : "") + imaginary + "i");
  }
}