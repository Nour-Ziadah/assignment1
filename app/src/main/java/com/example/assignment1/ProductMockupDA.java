package com.example.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductMockupDA {
    private List<Product> products;

    public ProductMockupDA(){
        products = new ArrayList<>();
        products.add(new Product("Cetaphil, Daily Facial Cleanser", 11.44, "Deep cleans and minimizes appearance of pores without stripping skin of natural moisture. This deep cleansing, gentle foaming formula now with hydrating glycerin and B5 & B3, reinforces the skin's moisture barrier, balances skin and is clinically tested to remove dirt, excess oils and makeup without leaving skin dry or tight.","Cleanser", "Dry Skin",R.drawable.cetaphil_cleanser, "Cetaphil"));
        products.add(new Product("Eucerin, Hydrating Cleansing Gel", 9.52,"Eucerin® Hydrating Cleansing Gel is a unique cleansing formula with hyaluronic acid that helps maintain skin's moisture balance. It cleanses effectively and leaves skin feeling refreshed and moisturized.", "Cleanser", "Oily Skin", R.drawable.eucerin_cleanser, "Eucerin"));
        products.add(new Product("Neutrogena, Hydro Boost Hydrating Gel Cleanser", 11.59,"Gently and thoroughly cleanse skin while boosting hydration with this fragrance-free cleansing gel. Featuring dermatologist-recognized Hyaluronic Acid, this lightweight cleanser increases skin's hydration level and locks in moisture.", "Cleanser", "Combination Skin", R.drawable.neutrogena_cleanser, "Neutrogena"));
        products.add(new Product("Cerave, Hydrating Facial Cleanser", 13.69,"CeraVe Hydrating Facial Cleanser was designed to cleanse and refresh the skin without over-stripping it or leaving it feeling tight and dry.", "Cleanser", "Dry Skin", R.drawable.cerave_cleanser, "Cerave"));
        products.add(new Product("Cetaphil, Moisturizing Cream", 6.97,"Rich cream with Sweet Almond Oil and Vitamins B3, B5 & E is clinically proven to nourish skin in 1 day and repair the skin's moisture barrier in 1 week for immediate and long lasting relief.", "Moisturizer", "Dry Skin", R.drawable.cetaphil_moisturizer, "Cetaphil"));
        products.add(new Product("Eucerin, Daily Hydration Lotion", 12.28,"Eucerin® Daily Hydration Lotion - a light weight formula that hydrates dry skin for softer, healthier - looking skin.", "Moisturizer", "Oily Skin", R.drawable.eucerin_moisturizer, "Eucerin"));
        products.add(new Product("Neutrogena, Ultra Gentle Daily Facial Moisturizer", 9.97,"Neutrogena Ultra Gentle Daily Facial Moisturizer conditions skin and helps support skin's dynamic barrier without clogging pores.", "Moisturizer", "Combination Skin", R.drawable.neutrogena_moisturizer, "Neutrogena"));
        products.add(new Product("Cerave, Oil Control Moisturizing Gel-Cream", 16.19,"Developed with dermatologists, CeraVe Oil Control Moisturizing Gel-Cream - with 3 essential ceramides - helps absorb excess oil for all day hydration and shine control. This oil free facial moisturizer's formula helps rebalance skin, leaving it neither too oily nor too dry.", "Moisturizer", "Oily Skin", R.drawable.cerave_moisturizer, "Cerave"));
        products.add(new Product("Cetaphil, Sheer Mineral Face Liquid Sunscreen", 14.11,"An ultra-lightweight, 100% mineral active sunscreen that reflects both UVA and UVB rays to help prevent sunburn. This formula dries with a matte finish, making it ideal for application under makeup or for daily wear by itself.", "Sunscreen", "Dry Skin", R.drawable.cetaphil_sunscreen, "Cetaphil"));
        products.add(new Product("Eucerin, Lightweight Sunscreen Lotion", 15.79,"UVA/UVB sun protection plus an Advanced Antioxidant Complex, 5 AOX Shield,™ that goes beyond neutralizing to also guard from free radicals and helps support skin health.", "Sunscreen", "Oily Skin", R.drawable.eucerin_sunscreen, "Eucerin"));
        products.add(new Product("Neutrogena, Ultra Sheer Oil-Free Face Serum", 13.99,"Moisturize and defend your skin with our SPF 60+ Hydrating Face Serum. Formulated with vitamin E, our powerful sunscreen serum is water-resistant", "Sunscreen", "Combination Skin", R.drawable.neutrogena_sunscreen, "Neutrogena"));
        products.add(new Product("Cerave, Hydrating Mineral Sunscreen", 15.99,"Protect your skin from the sun with a gentle, yet effective face lotion. CeraVe Hydrating Mineral Sunscreen Face Lotion with Broad Spectrum SPF 50 is a 100%-mineral, oil-free sunscreen with titanium dioxide and zinc oxide.", "Sunscreen", "Combination Skin", R.drawable.cerave_sunscreen, "Cerave"));
        products.add(new Product("La Roche-Posay, Toleriane Hydrating Gentle Cleanser", 18.99, "This gentle cleanser replenishes moisture and helps restore the skin’s natural protective barrier with Prebiotic Thermal Water.", "Cleanser", "Dry Skin", R.drawable.laroche_cleanser, "La Roche-Posay"));
        products.add(new Product("Aveeno, Positively Radiant Cleanser", 10.99, "Aveeno® Positively Radiant® Cleanser helps even skin tone and texture, with a brightening formula that enhances your natural glow.", "Cleanser", "Oily Skin", R.drawable.aveeno_cleanser, "Aveeno"));
        products.add(new Product("Olay, Regenerist Micro-Sculpting Cream", 29.99, "Olay Regenerist Micro-Sculpting Cream is a powerful moisturizer designed to help improve skin’s elasticity and reduce fine lines.", "Moisturizer", "Combination Skin", R.drawable.olay_moisturizer, "Olay"));
        products.add(new Product("Neutrogena, Oil-Free Acne Wash", 7.99, "Neutrogena® Oil-Free Acne Wash is a deep cleanser that works to fight acne with salicylic acid while leaving your skin feeling smooth.", "Cleanser", "Oily Skin", R.drawable.neutrogena_acne_cleanser, "Neutrogena"));
        products.add(new Product("Bioderma, Sensibio H2O Micellar Water", 16.99, "Bioderma Sensibio H2O Micellar Water gently cleanses and removes makeup, while maintaining the skin's balance.", "Cleanser", "Sensitive Skin", R.drawable.bioderma_micellar, "Bioderma"));
        products.add(new Product("Murad, Rapid Age Spot and Pigment Lightening Serum", 49.99, "Murad Rapid Age Spot and Pigment Lightening Serum reduces the appearance of dark spots and hyperpigmentation.", "Moisturizer", "All Skin Types", R.drawable.murad_serum, "Murad"));
        products.add(new Product("Shiseido, Urban Environment Oil-Free UV Protector SPF 42", 35.99, "This sunscreen offers advanced protection against UV rays and pollution while helping to maintain healthy, hydrated skin.", "Sunscreen", "All Skin Types", R.drawable.shiseido_sunscreen, "Shiseido"));
        products.add(new Product("Clinique, Even Better Clinical Dark Spot Corrector", 55.99, "Clinique's Even Better Clinical Dark Spot Corrector reduces dark spots and evens skin tone for a more radiant complexion.", "Moisturizer", "Dry Skin", R.drawable.clinique_spot_corrector, "Clinique"));
        products.add(new Product("Kiehl's, Ultra Facial Cream", 24.50, "Kiehl's Ultra Facial Cream is a deeply hydrating formula that balances the skin's moisture and helps it remain hydrated for 24 hours.", "Moisturizer", "Combination Skin", R.drawable.kiehls_moisturizer, "Kiehl's"));
    }

    public String[] getSkinTypes() {
        return new String[] {"All", "Dry Skin", "Oily Skin", "Combination Skin"};
    }

    public String[] getProductCategories() {
        return new String[] {"All", "Cleanser", "Moisturizer", "Sunscreen"};
    }

    public List<Product> getFilteredProducts(String skinType, String category) {
        List<Product> filteredProducts = new ArrayList<>();

        for (Product product : products) {
            boolean isSkinTypeMatch = isSkinTypeMatch(product, skinType);
            boolean isCategoryMatch = isCategoryMatch(product, category);

            if (isSkinTypeMatch && isCategoryMatch) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    private boolean isSkinTypeMatch(Product product, String skinType) {
        return skinType.equals("All") || product.getSkinType().equalsIgnoreCase(skinType);
    }

    private boolean isCategoryMatch(Product product, String category) {
        return category.equals("All") || product.getCategory().equalsIgnoreCase(category);
    }

    private Product getRandomProduct(String skinType, String category) {
        List<Product> filteredProducts = getFilteredProducts(skinType, category);
        if (filteredProducts.isEmpty()) {
            return null;
        }
        Random random = new Random();
        return filteredProducts.get(random.nextInt(filteredProducts.size()));
    }

    public List<Product> getRecommendedProductsForOily() {
        List<Product> recommendations = new ArrayList<>();
        recommendations.add(getRandomProduct("Oily Skin", "Cleanser"));
        recommendations.add(getRandomProduct("Oily Skin", "Moisturizer"));
        recommendations.add(getRandomProduct("Oily Skin", "Sunscreen"));
        return recommendations;
    }

    public List<Product> getRecommendedProductsForDry() {
        List<Product> recommendations = new ArrayList<>();
        recommendations.add(getRandomProduct("Dry Skin", "Cleanser"));
        recommendations.add(getRandomProduct("Dry Skin", "Moisturizer"));
        recommendations.add(getRandomProduct("Dry Skin", "Sunscreen"));
        return recommendations;
    }

    public List<Product> getRecommendedProductsForCombination() {
        List<Product> recommendations = new ArrayList<>();
        recommendations.add(getRandomProduct("Combination Skin", "Cleanser"));
        recommendations.add(getRandomProduct("Combination Skin", "Moisturizer"));
        recommendations.add(getRandomProduct("Combination Skin", "Sunscreen"));
        return recommendations;
    }

}
