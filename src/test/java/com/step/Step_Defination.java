package com.step;
import com.Base.Base_class;
import com.pom.Home;
import io.cucumber.java.en.When;

public class Step_Defination extends Base_class {

	Home h = new Home();

	@When("User launch the url {string}")
	public void user_launch_the_url(String url) throws InterruptedException {
		launchUrl(url);

	}

	@When("User clicks on shop women")
	public void user_clicks_on_shop_women() throws Exception {

		h.getShopwomen().click();
	}

	@When("user click on women product")
	public void user_click_on_women_product() throws Exception{
		Thread.sleep(2000); 
		Base_class.mouseHover(h.get_women_category());

	}

	@When("user click on women  Beauty & Personal Care")
	public void user_click_on_women_beauty_personal_care() throws Exception {
		Thread.sleep(3000);
		Base_class.mouseHover(h.getBandP_care());

		h.getBandP_care().click();
	}

	@When("User click on women Color Contour Palette & Makeup Brush")
	public void user_click_on_women_color_contour_palette_makeup_brush() throws Exception {
		Thread.sleep(3000);
		h.getproduct().click();

	}

	@When("User click on add to cart")
	public void user_click_on_add_to_cart() throws Exception {
		h.get_Cart().click();
	}

}
