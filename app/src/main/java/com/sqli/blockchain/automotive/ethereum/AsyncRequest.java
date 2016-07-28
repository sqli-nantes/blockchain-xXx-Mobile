package com.sqli.blockchain.automotive.ethereum;

/**
 * Created by gunicolas on 27/07/16.
 */
public abstract class AsyncRequest extends Request {

    public AsyncRequest(String name) {
        super(name);
    }

    public AsyncRequest(String name, String parameter) {
        super(name, parameter);
    }

    public AsyncRequest(String name, String[] _parameters) {
        super(name, _parameters);
    }

    public abstract void onSuccess(String data);
    public abstract void onFail(String error);

    @Override
    public boolean isAsync() {
        return true;
    }
}