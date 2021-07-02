package com.tianch.service.impl;

import com.tianch.entity.User1;
import com.tianch.entity.User2;
import com.tianch.service.TransService;
import com.tianch.service.User1Service;
import com.tianch.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransServiceImpl implements TransService {

    @Autowired
    private User1Service user1Service;

    @Autowired
    private User2Service user2Service;


    @Override
    public void notransaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequired(user2);

        throw new RuntimeException();
    }

    @Override
    public void notransaction_required_required_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiredException(user2);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_exception_required_required() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequired(user2);

        throw new RuntimeException();
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void transaction_required_required_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiredException(user2);
    }


    @Transactional
    @Override
    public void transaction_required_required_exception_try() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        try {
            user2Service.addRequiredException(user2);
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }

    @Override
    public void notransaction_exception_requiresNew_requiresNew() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequiresNew(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiresNew(user2);

        throw new RuntimeException();
    }

    @Override
    public void notransaction_requiresNew_requiresNew_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequiresNew(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiresNewException(user2);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void transaction_exception_required_requiresNew_requiresNew() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiresNew(user2);

        User2 user3 = new User2();
        user3.setName("王五");
        user2Service.addRequiresNew(user3);

        throw new RuntimeException();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void transaction_required_requiresNew_requiresNew_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiresNew(user2);

        User2 user3 = new User2();
        user3.setName("王五");
        user2Service.addRequiresNewException(user3);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void transaction_required_requiresNew_requiresNew_exception_try() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addRequired(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addRequiresNew(user2);
        User2 user3 = new User2();
        user3.setName("王五");
        try {
            user2Service.addRequiresNewException(user3);
        } catch (Exception e) {
            System.out.println("回滚");
        }
    }

    @Override
    public void notransaction_exception_nested_nested() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNested(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNested(user2);

        throw new RuntimeException();
    }

    @Override
    public void notransaction_nested_nested_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNested(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNestedException(user2);
    }


    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void transaction_exception_nested_nested() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNested(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNested(user2);

        throw new RuntimeException();
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void transaction_nested_nested_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNested(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNestedException(user2);
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public void transaction_nested_nested_exception_try() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNested(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        try {
            user2Service.addNestedException(user2);
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }

    @Override
    public void notransaction_mandatory() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addMandatory(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addMandatory(user2);
    }

    @Override
    @Transactional
    public void transaction_mandatory() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addMandatory(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addMandatory(user2);
    }

    @Override
    public void notransaction_never() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNever(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNever(user2);
    }

    @Override
    @Transactional
    public void transaction_never() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNever(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNever(user2);
    }

    @Override
    public void notransaction_exception_supports_supports() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addSupports(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addSupports(user2);

        throw new RuntimeException();
    }

    @Override
    public void notransaction_supports_supports_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addSupports(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addSupportsException(user2);
    }


    @Override
    @Transactional
    public void transaction_exception_supports_supports() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addSupports(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addSupports(user2);

        throw new RuntimeException();
    }

    @Override
    @Transactional
    public void transaction_supports_supports_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addSupports(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addSupportsException(user2);
    }

    @Transactional
    @Override
    public void transaction_supports_supports_exception_try() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addSupports(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        try {
            user2Service.addSupportsException(user2);
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }


    @Override
    public void notransaction_exception_notSupported_notSupported() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNotSupported(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNotSupported(user2);

        throw new RuntimeException();
    }


    @Override
    public void notransaction_notSupported_notSupported_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNotSupported(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNotSupportedException(user2);
    }


    @Override
    @Transactional
    public void transaction_exception_notSupported_notSupported() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNotSupported(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNotSupported(user2);

        throw new RuntimeException();
    }


    @Override
    @Transactional
    public void transaction_notSupported_notSupported_exception() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNotSupported(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        user2Service.addNotSupportedException(user2);
    }


    @Transactional
    @Override
    public void transaction_notSupported_notSupported_exception_try() {
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.addNotSupported(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        try {
            user2Service.addNotSupportedException(user2);
        } catch (Exception e) {
            System.out.println("方法回滚");
        }
    }

}