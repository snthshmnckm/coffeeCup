class ClassExample {
    int id;
    String name;

    // Constructor name corrected to match the class name
    ClassExample(int sid, String sname) {
        id = sid;
        name = sname;
    }

    public void setId(int sid) {
        id = sid;
    }

    public void setName(String sname) {
        name = sname;
    }

    public String toString() {
        return "Student [id = " + id + ", name = " + name + "]";
    }
}
