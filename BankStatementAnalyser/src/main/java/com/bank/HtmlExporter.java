package com.bank;

public class HtmlExporter implements Exporter{

    @Override
    public String export(SummaryStatistics summaryStatistics) {

        String result = "<STRONG>The sum is</STRONG>: " + summaryStatistics.getSum()+"\n";
        result += "<STRONG>The average is</STRONG>: " + summaryStatistics.getAverage()+"\n";
        result += "<STRONG>The max is</STRONG>: " + summaryStatistics.getMax()+"\n";
        result += "<STRONG>The min is</STRONG>: " + summaryStatistics.getMin()+"\n";
        return result;
    }
}
