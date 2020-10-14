package com.algorithm.sort;

/**
 * @author jiahuixi
 * @date 2019/3/5 11:40
 */
public class Students implements Comparable {
    private String name;
    private Double score;
    public Students( String name,Double score){
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        if(o == this){
            return 0;
        }
        if(o.getClass() == this.getClass()){
            Students sd = (Students) o;
            if(this.score > sd.score){
                return 1;
            }else if(this.score < sd.score){
                return -1;
            }else{
                return 0;
            }
        }
        return 0;
    }
}
