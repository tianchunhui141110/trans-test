package com.tianch;

import com.tianch.service.TransService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransTestApplicationTests {

    @Autowired
    private TransService transService;

    @Test
    void transTest() {

//        1. PROPAGATION_REQUIRED
        // 1.1外围方法不开启事务
        // 验证方法1
//        transService.notransaction_exception_required_required();
        // 验证方法2
//        transService.notransaction_required_required_exception();

        // 1.2 外围方法开启事务
        // 验证方法1
//        transService.transaction_exception_required_required();
        // 验证方法2
//        transService.transaction_required_required_exception();
        // 验证方法3
//        transService.transaction_required_required_exception_try();

//      2.PROPAGATION_REQUIRES_NEW
        // 2.1外围方法不开启事务
        // 验证方法1
//        transService.notransaction_exception_requiresNew_requiresNew();
        // 验证方法2
//        transService.notransaction_requiresNew_requiresNew_exception();

        // 2.2外围方法开启事务
        // 验证方法1
//        transService.transaction_exception_required_requiresNew_requiresNew();
        // 验证方法2
//        transService.transaction_required_requiresNew_requiresNew_exception();
        // 验证方法3
//        transService.transaction_required_requiresNew_requiresNew_exception_try();

        // 3.PROPAGATION_NESTED
        // 3.1 外围方法不开启事务
        // 验证方法1
//        transService.notransaction_exception_nested_nested();
        // 验证方法2
//        transService.notransaction_requiresNew_requiresNew_exception();
        // 3.2外围方法开启事务
//        transService.transaction_exception_nested_nested();
        // 4.PROPAGATION_MANDATORY
        // 4.1外围方法不开启事务
//        transService.notransaction_mandatory();
        // 4.2外围方法开启事务
//        transService.transaction_mandatory();

        // 5.PROPAGATION_NEVER
        // 5.1外围方法不开启事务
//        transService.notransaction_never();
        // 5.2外围方法开启事务
//        transService.transaction_never();

        // 6. PROPAGATION_SUPPORTS
        // 6.1外围方法不开启事务
        // 验证方法1
//        transService.notransaction_exception_supports_supports();
        // 验证方法2
//        transService.notransaction_supports_supports_exception();

        // 6.2 外围方法开启事务
        // 验证方法1
//        transService.transaction_exception_supports_supports();
        // 验证方法2
//        transService.transaction_supports_supports_exception();
        // 验证方法3
//        transService.transaction_supports_supports_exception_try();

        // 7. NOT_SUPPORTED
        // 7.1外围方法不开启事务
        // 验证方法1
//        transService.notransaction_exception_notSupported_notSupported();
        // 验证方法2
//        transService.notransaction_notSupported_notSupported_exception();

        // 7.2 外围方法开启事务
        // 验证方法1
//        transService.transaction_exception_notSupported_notSupported();
        // 验证方法2
//        transService.transaction_notSupported_notSupported_exception();
        // 验证方法3
//        transService.transaction_notSupported_notSupported_exception_try();
    }

}
