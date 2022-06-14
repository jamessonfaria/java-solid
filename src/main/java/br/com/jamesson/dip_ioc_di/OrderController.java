package br.com.jamesson.dip_ioc_di;

import java.io.IOException;
import java.math.BigDecimal;

public class OrderController {

    private final IDeliveryService deliveryService;

    public OrderController(IDeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public String place(String customerId, String zipCode, String promoCode, int[] products) throws IOException {
            // #1 - Recupera o cliente
//            Customer customer = null;
//            using (var conn = new SqlConnection("CONN_STRING"))
//            {
//                customer = conn.Query<Customer>
//                        ("SELECT * FROM CUSTOMER WHERE ID=" + customerId)
//                                .FirstOrDefault();
//            }

            // #2 - Calcula o frete
            BigDecimal deliveryFee = this.deliveryService.GetDeliveryFee(zipCode);

            // #3 - Calcula o total dos produtos
//            decimal subTotal = 0;
//            for (int p = 0; p < products.Length; p++)
//            {
//                var product = new Product();
//                using (var conn = new SqlConnection("CONN_STRING"))
//                {
//                    product = conn.Query<Product>
//                            ("SELECT * FROM PRODUCT WHERE ID=" + products[p])
//                                    .FirstOrDefault();
//                }
//                subTotal += product.Price;
//            }

            // #4 - Aplica o cupom de desconto
//            decimal discount = 0;
//            using (var conn = new SqlConnection("CONN_STRING"))
//            {
//
//                var promo = conn.Query<PromoCode>
//                        ("SELECT * FROM PROMO_CODES WHERE CODE=" + promoCode)
//                                .FirstOrDefault();
//                if (promo.ExpireDate > DateTime.Now)
//                {
//                    discount = promo.Value;
//                }
//            }

            // #5 - Gera o pedido
//            var order = new Order();
//            order.Code = Guid.NewGuid().ToString().ToUpper().Substring(0, 8);
//            order.Date = DateTime.Now;
//            order.DeliveryFee = deliveryFee;
//            order.Discount = discount;
//            order.Products = products;
//            order.SubTotal = subTotal;
//
//            // #6 - Calcula o total
//            order.Total = subTotal - discount + deliveryFee;

            // #7 - Retorna
            return "Pedido gerado com sucesso!";
        }

}
