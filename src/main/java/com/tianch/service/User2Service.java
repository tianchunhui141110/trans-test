package com.tianch.service;

import com.tianch.entity.User2;

/**
 * @author tianch
 * @date 2021/7/2 14:20
 */

public interface User2Service {

    void addRequired(User2 user);

    void addRequiredException(User2 user);

    void addRequiresNew(User2 user);

    void addRequiresNewException(User2 user);

    void addNested(User2 user);

    void addNestedException(User2 user);

    void addMandatory(User2 user);

    void addNever(User2 user);

    void addSupports(User2 user);

    void addSupportsException(User2 user);

    void addNotSupported(User2 user);

    void addNotSupportedException(User2 user);
}
