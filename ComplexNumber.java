public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }   
    
    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realProduct = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realQuotient = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryQuotient = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(realQuotient, imaginaryQuotient);
    }
    
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
