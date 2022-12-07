package models;

/* 
 * POJO for an Id object
 */
//handles the data logic and intereacts with the database it saves and updates that data here
//it sends the stuff to the controller
public class Id {
    private String userId = "";
    private String name = "";
    private String github = "";

    public Id (String name, String githubId) {}

    public String getUid() {
        return userId;
    }

//    public void setUid(String uid) {
//        this.uid = uid;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.github + ") ";
    }
}