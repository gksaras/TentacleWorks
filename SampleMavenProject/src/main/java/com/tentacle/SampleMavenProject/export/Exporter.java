package com.tentacle.SampleMavenProject.export;

import com.tentacle.SampleMavenProject.domain.Summary;

public interface Exporter {

	String export(Summary s);
}
