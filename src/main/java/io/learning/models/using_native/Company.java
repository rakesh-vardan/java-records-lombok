package io.learning.models.using_native;

public class Company {

    public String name;
    public String catchPhrase;
    public String bs;

    public void setName(String name) {
        this.name = name;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public String toString() {
        return "Company [name=" + name + ", catchPhrase=" + catchPhrase + ", bs=" + bs + "]";
    }
}
