//package myclasses;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class MyAction {
//
//    private int actionId;
//    private String actionType;
//    private String type;
//    private String username;
//    private String objectType;
//    private String sortType;
//    private String criteria;
//    private String title;
//    private String genre;
//    private int number;
//    private double grade;
//    private int seasonNumber;
//
//    public List<List<String>> filters = new ArrayList<>();
//
//    public MyAction(final int actionId, final String actionType,
//                              final String type, final String username, final String genre) {
//        this.actionId = actionId;
//        this.actionType = actionType;
//        this.type = type;
//        this.username = username;
//        this.genre = genre;
//        this.objectType = null;
//        this.sortType = null;
//        this.criteria = null;
//        this.number = 0;
//        this.title = null;
//        this.grade = 0;
//        this.seasonNumber = 0;
//    }
//
//    public MyAction(final int actionId, final String actionType, final String objectType,
//                           final String genre, final String sortType, final String criteria,
//                           final String year, final int number, final List<String> words,
//                           final List<String> awards) {
//        this.actionId = actionId;
//        this.actionType = actionType;
//        this.objectType = objectType;
//        this.sortType = sortType;
//        this.criteria = criteria;
//        this.number = number;
//        this.filters.add(new ArrayList<>(Collections.singleton(year)));
//        this.filters.add(new ArrayList<>(Collections.singleton(genre)));
//        this.filters.add(words);
//        this.filters.add(awards);
//        this.title = null;
//        this.type = null;
//        this.username = null;
//        this.genre = null;
//        this.grade = 0;
//        this.seasonNumber = 0;
//    }
//
//    public MyAction(final int actionId, final String actionType, final String type,
//                           final String username, final String title, final Double grade,
//                           final int seasonNumber) {
//        this.actionId = actionId;
//        this.actionType = actionType;
//        this.type = type;
//        this.grade = grade;
//        this.username = username;
//        this.title = title;
//        this.seasonNumber = seasonNumber;
//        this.genre = null;
//        this.objectType = null;
//        this.sortType = null;
//        this.criteria = null;
//        this.number = 0;
//    }
//
//    public int getActionId() {
//        return actionId;
//    }
//
//    public String getActionType() {
//        return actionType;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getObjectType() {
//        return objectType;
//    }
//
//    public String getSortType() {
//        return sortType;
//    }
//
//    public String getCriteria() {
//        return criteria;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//
//    public double getGrade() {
//        return grade;
//    }
//
//    public int getSeasonNumber() {
//        return seasonNumber;
//    }
//
//    public List<List<String>> getFilters() {
//        return filters;
//    }
//
//    @Override
//    public String toString() {
//        return "MyAction{" +
//                "actionId=" + actionId +
//                ", actionType='" + actionType + '\'' +
//                ", type='" + type + '\'' +
//                ", username='" + username + '\'' +
//                ", objectType='" + objectType + '\'' +
//                ", sortType='" + sortType + '\'' +
//                ", criteria='" + criteria + '\'' +
//                ", title='" + title + '\'' +
//                ", genre='" + genre + '\'' +
//                ", number=" + number +
//                ", grade=" + grade +
//                ", seasonNumber=" + seasonNumber +
//                ", filters=" + filters +
//                '}' + "\n";
//    }
//}
