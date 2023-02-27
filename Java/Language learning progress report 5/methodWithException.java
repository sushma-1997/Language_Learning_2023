public double divide(int numerator, int denominator) throws ArithmeticException {
    if (denominator == 0) {
        throw new ArithmeticException("Denominator cannot be zero.");
    }
    return (double) numerator / denominator;
}
