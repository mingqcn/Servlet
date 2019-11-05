package xmu.oomall.service;

import xmu.oomall.domain.ACoupon;

/**
 * @Author: Ming Qiu
 * @Description: 优惠卷有关的服务
 * @Date: Created in 15:47 2019/11/5
 * @Modified By:
 **/
public interface CouponService {

    /**
     * 用id找到ACoupon对象
     * @param id
     * @return
     */

    public ACoupon findACouponById(Integer id);
}
