package br.com.jamesson.dip_ioc_di.controller;

import br.com.jamesson.dip_ioc_di.entity.Customer;
import br.com.jamesson.dip_ioc_di.repository.ICustomerRepository;
import br.com.jamesson.dip_ioc_di.service.IDeliveryService;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public class OrderController {

    private final IDeliveryService deliveryService;
    private final ICustomerRepository customerRepository;

    public OrderController(IDeliveryService deliveryService, ICustomerRepository customerRepository) {
        this.deliveryService = deliveryService;
        this.customerRepository = customerRepository;
    }

    public String place(String customerId, String zipCode, String promoCode, int[] products) throws IOException, SQLException {
        // #1 - Recupera o cliente
        Customer customer = this.customerRepository.get(customerId);

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
