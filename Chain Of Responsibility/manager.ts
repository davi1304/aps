import { BaseBudgetHandler } from './budget_handler';
import { CustomerBudget } from './customer';

export class ManagerBudgetHandler extends BaseBudgetHandler {
  handle(budget: CustomerBudget): CustomerBudget {
    if (budget.total <= 5000) {
      console.log('O gerente tratou o orçamento');
      budget.approved = true;
      return budget;
    }

    return super.handle(budget);
  }
}