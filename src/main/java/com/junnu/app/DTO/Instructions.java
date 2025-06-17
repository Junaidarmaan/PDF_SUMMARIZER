package com.junnu.app.DTO;

public class Instructions {
    String text;
    String instruction;
    String temperature;
    String top_p;
    String num_beams;
    String repetition_penalty;
    String min_length;
    String max_length;

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

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTop_p() {
        return top_p;
    }

    public void setTop_p(String top_p) {
        this.top_p = top_p;
    }

    public String getNum_beams() {
        return num_beams;
    }

    public void setNum_beams(String num_beams) {
        this.num_beams = num_beams;
    }

    public String getRepetition_penalty() {
        return repetition_penalty;
    }

    public void setRepetition_penalty(String repetition_penalty) {
        this.repetition_penalty = repetition_penalty;
    }

    public String getMin_length() {
        return min_length;
    }

    public void setMin_length(String min_length) {
        this.min_length = min_length;
    }

    public String getMax_length() {
        return max_length;
    }

    public void setMax_length(String max_length) {
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

}
