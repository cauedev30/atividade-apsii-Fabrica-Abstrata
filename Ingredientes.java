interface Dough {}
class ThinCrustDough implements Dough { public String toString() { return "Massa fina"; } }
class ThickCrustDough implements Dough { public String toString() { return "Massa grossa"; } }

interface Sauce {}
class MarinaraSauce implements Sauce { public String toString() { return "Molho marinara"; } }
class PlumTomatoSauce implements Sauce { public String toString() { return "Molho de tomate"; } }

interface Cheese {}
class ReggianoCheese implements Cheese { public String toString() { return "Queijo parmesão"; } }
class MozzarellaCheese implements Cheese { public String toString() { return "Mussarela"; } }

interface Veggies {}
class Garlic implements Veggies {}
class Onion implements Veggies {}
class Mushroom implements Veggies {}
class RedPepper implements Veggies {}
class Spinach implements Veggies {}
class BlackOlives implements Veggies {}
class Eggplant implements Veggies {}

interface Pepperoni {}
class SlicedPepperoni implements Pepperoni {}

interface Clam {}
class FreshClam implements Clam {}
class FrozenClam implements Clam {}
