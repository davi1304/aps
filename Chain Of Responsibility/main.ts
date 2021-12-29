import { CustomerBudget } from './customer';
import { SellerBudgetHandler } from './seller';
import { ManagerBudgetHandler } from './manager';
import { DirectorBudgetHandler } from './director';
import { CEOBudgetHandler } from './ceo';

const customerBudget = new CustomerBudget(1001);

const seller = new SellerBudgetHandler();
seller
  .setNextHandler(new ManagerBudgetHandler())
  .setNextHandler(new DirectorBudgetHandler())
  .setNextHandler(new CEOBudgetHandler());

seller.handle(customerBudget);
console.log(customerBudget);