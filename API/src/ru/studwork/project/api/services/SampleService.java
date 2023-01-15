package ru.studwork.project.services;

import ru.studwork.project.data.Sample;

import java.util.List;
public interface SampleService {
    String addSample(Sample sample);

    void delSample(String id);

    Sample getSample(String id);

    List<Sample> getSampleList();
}
