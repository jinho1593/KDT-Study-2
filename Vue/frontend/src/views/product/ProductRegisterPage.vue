<template lang="">
    <div>

        <product-register-form @submit="onSubmit"/>
    </div>
</template>
<script>

import ProductRegisterForm from '@/components/product/ProductRegisterForm.vue';
// RegisterButtonForm 컴포넌트를 가져옴
import { mapActions } from 'vuex';
// vuex에서 mapActions 함수를 가져옴.

const productModule = 'productModule'

export default {
    components: {
        ProductRegisterForm
    },
    name: "ProductRegisterPage",
    methods: {
        ...mapActions(
            productModule, ['requestCreateProductToSpring']
        ),
        async onSubmit(payload) {
            const product = await this.requestCreateProductToSpring(payload)
            console.log('product: ' + JSON.stringify(product))

        }
    },


}
</script>
<style lang="">
    
</style>