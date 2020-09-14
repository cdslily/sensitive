package com.github.houbb.sensitive.test.model.sensitive.entry;

import com.github.houbb.sensitive.test.annotation.custom.SensitiveEntryCustom;
import com.github.houbb.sensitive.test.model.sensitive.User;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 对象集合
 * @author dev-sxl
 * date 2020-09-14
 * @since 0.0.11
 */
public class CustomUserCollection {

    @SensitiveEntryCustom
    private User[] userArray;

    @SensitiveEntryCustom
    private List<User> userList;

    @SensitiveEntryCustom
    private Set<User> userSet;

    @SensitiveEntryCustom
    private Collection<User> userCollection;

    /**
     * SensitiveEntry 注解不会生效
     */
    @SensitiveEntryCustom
    private Map<String, User> userMap;

    public User[] getUserArray() {
        return userArray;
    }

    public void setUserArray(User[] userArray) {
        this.userArray = userArray;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "CustomUserCollection{" +
                "userList=" + userList +
                ", userSet=" + userSet +
                ", userCollection=" + userCollection +
                ", userMap=" + userMap +
                '}';
    }

}
