package modelo;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	private Float value1;
	private Float value2;
	private Float result;
	private List<String> results = new ArrayList<>();

	public Float getValue1() {
		return value1;
	}

	public void setValue1(Float value1) {
		this.value1 = value1;
	}

	public Float getValue2() {
		return value2;
	}

	public void setValue2(Float value2) {
		this.value2 = value2;
	}

	public Float getResult() {
		return result;
	}

	public void setResult(Float result) {
		this.result = result;
	}

	public List<String> getResults() {
		return results;
	}

	public void setResults(List<String> results) {
		this.results = results;
	}
	
	public void soma(){
		result=value1+value2;
		results.add("["+value1+"+"+value2+"="+result+"]");
	}
        public void subtract(){
		result=value1-value2;
		results.add("["+value1+"-"+value2+"="+result+"]");
	}
        public void multiply(){
		result=value1*value2;
		results.add("["+value1+"*"+value2+"="+result+"]");
	}
        public void div(){
		result=value1/value2;
		results.add("["+value1+"/"+value2+"="+result+"]");
	}

}