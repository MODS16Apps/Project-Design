package org.mods.app.minerals_boneyard;

public class quizpart {
int image;
String question, answer;

public quizpart(int image, String question, String answer) {
        this.image = image;
        this.question = question;
        this.answer = answer;
        }

public int getImage() {
        return image;
        }

public void setImage(int image) {
        this.image = image;
        }

public String getQuestion() {
        return question;
        }

public void setQuestion(String question) {
        this.question = question;
        }

public String getAnswer() {
        return answer;
        }

public void setAnswer(String answer) {
        this.answer = answer;
        }

}

