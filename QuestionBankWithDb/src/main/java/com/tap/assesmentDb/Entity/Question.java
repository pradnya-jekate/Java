package com.tap.assesmentDb.Entity;


public class Question 
{
    private String title;
    private int id;
    private int subjectId;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;
    private int evalutionCriteria;

    public Question(){}


    public Question(String string, String string2, String string3, String string4, String string5, String string6,
            int int1, int int2, int int3) {
        //TODO Auto-generated constructor stub
    }


    public void question(String title ,String optionA ,String optionB ,String optionC ,String optionD ,String correctAnswer,
        int evalutionCriteria ,int id ,int subjectId)
        {
            this.title=title;
            this.optionA=optionA;
            this.optionB=optionB;
            this.optionC=optionC;
            this.optionD=optionD;
            this.correctAnswer=correctAnswer;
            this.evalutionCriteria=evalutionCriteria;
            this.id=id;
            this.subjectId=subjectId;
        }
    
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getSubjectId() {
            return subjectId;
        }
        public void setSubjectId(int subjectId) {
            this.subjectId = subjectId;
        }
        public String getOptionA() {
            return optionA;
        }
        public void setOptionA(String optionA) {
            this.optionA = optionA;
        }
        public String getOptionB() {
            return optionB;
        }
        public void setOptionB(String optionB) {
            this.optionB = optionB;
        }
        public String getOptionC() {
            return optionC;
        }
        public void setOptionC(String optionC) {
            this.optionC = optionC;
        }
        public String getOptionD() {
            return optionD;
        }
        public void setOptionD(String optionD) {
            this.optionD = optionD;
        }
        public String getCorrectAnswer() {
            return correctAnswer;
        }
        public void setCorrectAnswer(String correctAnswer) {
            this.correctAnswer = correctAnswer;
        }
        public int getEvalutionCriteria() {
            return evalutionCriteria;
        }
        public void setEvalutionCriteria(int evalutionCriteria) {
            this.evalutionCriteria = evalutionCriteria;
        }
        @Override
        public String toString() {
            return "question {title=" + title + ", id=" + id + ", subjectId=" + subjectId + ", optionA=" + optionA
                    + ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", correctAnswer="
                    + correctAnswer + ", evalutionCriteria=" + evalutionCriteria + ", getTitle()=" + getTitle()
                    + ", getId()=" + getId() + ", getSubjectId()=" + getSubjectId() + ", getOptionA()=" + getOptionA()
                    + ", getClass()=" + getClass() + ", getOptionB()=" + getOptionB() + ", getOptionC()=" + getOptionC()
                    + ", getOptionD()=" + getOptionD() + ", getCorrectAnswer()=" + getCorrectAnswer()
                    + ", getEvalutionCriteria()=" + getEvalutionCriteria() + ", hashCode()=" + hashCode()
                    + ", toString()=" + super.toString() + "}";
        }


        public int getEvaluationCriteria() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getEvaluationCriteria'");
        }


        public void setCorrctAnswer(String nextLine) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setCorrctAnswer'");
        }


        public void setEvaluationCriteria(String nextLine) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'setEvaluationCriteria'");
        }

}    

       
        
        
    