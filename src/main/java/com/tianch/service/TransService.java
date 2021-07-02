package com.tianch.service;

import com.tianch.entity.User1;

/**
 * @author tianch
 * @date 2021/7/2 14:20
 */

public interface TransService {

    void notransaction_exception_required_required();
    void notransaction_required_required_exception();

    void transaction_exception_required_required();
    void transaction_required_required_exception();
    void transaction_required_required_exception_try();


    void notransaction_exception_requiresNew_requiresNew();
    void notransaction_requiresNew_requiresNew_exception();

    void transaction_exception_required_requiresNew_requiresNew();
    void transaction_required_requiresNew_requiresNew_exception();
    void transaction_required_requiresNew_requiresNew_exception_try();

    void notransaction_exception_nested_nested();
    void notransaction_nested_nested_exception();

    void transaction_exception_nested_nested();
    void transaction_nested_nested_exception();
    void transaction_nested_nested_exception_try();

    void notransaction_mandatory();
    void transaction_mandatory();

    void notransaction_never();
    void transaction_never();

    void notransaction_exception_supports_supports();
    void notransaction_supports_supports_exception();

    void transaction_exception_supports_supports();
    void transaction_supports_supports_exception();
    void transaction_supports_supports_exception_try();


    void notransaction_exception_notSupported_notSupported();
    void notransaction_notSupported_notSupported_exception();

    void transaction_exception_notSupported_notSupported();
    void transaction_notSupported_notSupported_exception();
    void transaction_notSupported_notSupported_exception_try();

}
