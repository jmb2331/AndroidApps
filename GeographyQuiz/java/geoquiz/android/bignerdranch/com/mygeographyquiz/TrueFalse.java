package geoquiz.android.bignerdranch.com.mygeographyquiz;

public class TrueFalse {
    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    private int mQuestion;

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    private boolean mTrueQuestion;

    public TrueFalse(int question, boolean trueQuestion) {


        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

}
