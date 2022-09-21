package academic.grade;

public class Grade {

    private String topic;
    private double value;

    public Grade(String topic, double value) throws Exception {
        setTopic(topic);
        setValue(value);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) throws Exception {
        if (topic.length() == 0)
            throw new Exception("Assunto não pode ser vazio.");

        this.topic = topic;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) throws Exception {
        if (value < 0 || value > 10)
            throw new Exception("Nota fora do intervalo: 0 <= n <= 10.");

        this.value = value;
    }

}
