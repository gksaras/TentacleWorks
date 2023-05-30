package com.tentacle.SampleMavenProject.export;

import com.tentacle.SampleMavenProject.domain.Summary;

public class HtmlExporter implements Exporter {

	@Override
	public String export(Summary s) {
	
		   String result = "<STRONG>The sum is</STRONG>: " + s.getSum();
	        result += "<STRONG>The average is</STRONG>: " + s.getAvg();
	        result += "<STRONG>The max is</STRONG>: " + s.getMax();
	        result += "<STRONG>The min is</STRONG>: " + s.getMin();
	        return result;
	}
}
