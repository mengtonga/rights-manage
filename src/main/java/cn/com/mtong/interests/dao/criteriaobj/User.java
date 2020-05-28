package cn.com.mtong.interests.dao.criteriaobj;

public class User {
    private String handler;

    private String status;

    private String companyId;

    private String personId;

    private String name;

    private String createBeginTime;

    private String createEndTime;

    private String requiredFinsihBeginTime;

    private String requiredFinsihEndTime;

    private String relationId;

    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateBeginTime() {
        return createBeginTime;
    }

    public void setCreateBeginTime(String createBeginTime) {
        this.createBeginTime = createBeginTime;
    }

    public String getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(String createEndTime) {
        this.createEndTime = createEndTime;
    }

    public String getRequiredFinsihBeginTime() {
        return requiredFinsihBeginTime;
    }

    public void setRequiredFinsihBeginTime(String requiredFinsihBeginTime) {
        this.requiredFinsihBeginTime = requiredFinsihBeginTime;
    }

    public String getRequiredFinsihEndTime() {
        return requiredFinsihEndTime;
    }

    public void setRequiredFinsihEndTime(String requiredFinsihEndTime) {
        this.requiredFinsihEndTime = requiredFinsihEndTime;
    }
}