package daumNewsCatchProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public String regularExpression(String str, String expression) {
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(str);
		StringBuffer stringBuffer = new StringBuffer();
		while (matcher.find()) {
			stringBuffer.append(matcher.group() + "\n");
		}
		return stringBuffer.toString();
	}
	public String regularExpression(String str, String[] expression){
		String result = str;
		for( int i = 0 ; i <expression.length; i++){
			result = regularExpression(result, expression[i]);
		}
		return result;
	}
}
