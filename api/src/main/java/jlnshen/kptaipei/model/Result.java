package jlnshen.kptaipei.model;


public class Result<T> {
    public boolean isSuccess;
    public int errorCode;
    public String errorMessage;
    public T data;
    public PageInfo pageInfo;
}
