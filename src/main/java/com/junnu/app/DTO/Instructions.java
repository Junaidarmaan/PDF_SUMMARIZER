package com.junnu.app.DTO;

public class Instructions {
    String text;
    String instruction = "Summarize the following text briefly by extracting only the most important points. Present the summary as bullet points.";
    double temperature = 1.5;
    double top_p = 0.7;
    int num_beams = 4;
    double repetition_penalty = 2;
    double min_length = 0.3;
    double max_length = 0.4;
    int noRepeat = 5;

    
    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }


    public String getInstruction() {
        return instruction;
    }


    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }


    public double getTemperature() {
        return temperature;
    }


    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }


    public double getTop_p() {
        return top_p;
    }


    public void setTop_p(double top_p) {
        this.top_p = top_p;
    }


    public int getNum_beams() {
        return num_beams;
    }


    public void setNum_beams(int num_beams) {
        this.num_beams = num_beams;
    }


    public double getRepetition_penalty() {
        return repetition_penalty;
    }


    public void setRepetition_penalty(double repetition_penalty) {
        this.repetition_penalty = repetition_penalty;
    }


    public double getMin_length() {
        return min_length;
    }


    public void setMin_length(double min_length) {
        this.min_length = min_length;
    }


    public double getMax_length() {
        return max_length;
    }


    public void setMax_length(double max_length) {
        this.max_length = max_length;
    }


    @Override
    public String toString() {
        return "{"
                + "\"text\":\"" + text + "\", "
                + "\"instruction\":\"" + instruction + "\", "
                + "\"temperature\":" + temperature + ", "
                + "\"top_p\":" + top_p + ", "
                + "\"num_beams\":" + num_beams + ", "
                + "\"repetition_penalty\":" + repetition_penalty + ", "
                + "\"min_length\":" + min_length + ", "
                + "\"max_length\":" + max_length
                + "}";
    }


    public int getNoRepeat() {
        return noRepeat;
    }


    public void setNoRepeat(int noRepeat) {
        this.noRepeat = noRepeat;
    }

}
