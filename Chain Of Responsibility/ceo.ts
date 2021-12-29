import { BaseBudgetHandler } from './budget_handler';
import { CustomerBudget } from './customer';

export class CEOBudgetHandler extends BaseBudgetHandler {
  handle(budget: CustomerBudget): CustomerBudget {
    console.log('O CEO trata qualquer orçamento');
    budget.approved = true;
    return budget;
  }
}