class Polynomial{
	public double[] coefficients;
	public Polynomial(){
		coefficients = new double [100];
	}
	public Polynomial(double[] coefficients_1){
		coefficients = new double [100];
		for(int i = 0; i < coefficients_1.length; i++){
			coefficients[i] = coefficients_1[i];
		}
	}
	public Polynomial add(Polynomial added){
		Polynomial answer = new Polynomial();
		for(int i = 0; i < coefficients.length; i++){
			answer.coefficients[i] = coefficients[i] + added.coefficients[i];
		}
		return answer;
	}
	public double evaluate(double x){
		double answer = 0;
		for(int i = 0; i < coefficients.length; i++){
			double scalar = 1;
			for(int j = 1; j <= i; j++){
				scalar = scalar * x;
			}
			answer += coefficients[i] * scalar; 
		}
		return answer;
	}
	public boolean hasRoot(double x){
		double answer = evaluate(x);
		if(answer == 0){
			return true;
		}
		return false;
	}
}
