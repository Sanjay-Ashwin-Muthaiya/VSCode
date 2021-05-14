class GrandFather {
    String age = "80";

}

class Father extends GrandFather {
    String age = "55";

    public String work() {
        String gf_age = super.age;
        return "Software Engineer " + age + " " + "GrandFatherAge " + gf_age;
    }
}

class Son extends Father {
    String age = "25";

    public String work() {
        String gfatherAnd_father = super.work();
        return "MBA " + age + " " + gfatherAnd_father;
    }
}
