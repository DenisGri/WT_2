package by.bsuir.poit.wt.service.validation;

import by.bsuir.poit.wt.entity.criteria.Criteria;


public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		return criteria != null && criteria.getGroupSearchName() != null && criteria.getCriteria() != null;
	}
}