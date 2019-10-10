package labs_examples.static_nonstatic.labs;


class Static_NonStatic_SameClass {


    // static method 1

    static void jobApplication() {

        System.out.print("The applicant sent out his resume to ");
        Static_NonStatic_SameClass resume = new Static_NonStatic_SameClass();
        resume.resume(10);
        System.out.println(" companies.");
    }

    // mom-static method 2

    void resume(int resume) {

        System.out.print(resume);
    }


    //psvm


    public static void main(String[] args) {

        jobApplication();


    }

    }

