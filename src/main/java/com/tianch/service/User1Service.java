package com.tianch.service;

import com.tianch.entity.User1;

/**
 * @author tianch
 * @date 2021/7/2 14:20
 */

public interface User1Service {

    void addRequired(User1 user);

    void addRequiresNew(User1 user);

    void addNested(User1 user);

    void addMandatory(User1 user1);

    void addNever(User1 user);

    void addSupports(User1 user);

    void addNotSupported(User1 user);
}
