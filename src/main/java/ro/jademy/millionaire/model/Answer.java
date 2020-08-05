package ro.jademy.millionaire.model;

public class Answer {
    private String response;
    private boolean isCorrect;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public Answer(String response, boolean isCorrect){
        this.response = response;
        this.isCorrect = isCorrect;
    }
}
