package org.dkansh.account.controller;

import org.dkansh.account.entity.Account;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

	@RequestMapping(value = "get", method = RequestMethod.GET)
	public Account getAccount() {
		return new Account(101, "Saving", 1200.56);
	}
}
