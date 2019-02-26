package sobaya.app.myapplication

import com.xwray.groupie.databinding.BindableItem

class Item : BindableItem<sobaya.app.myapplication.databinding.ItemBinding>() {

    override fun getLayout() = R.layout.item

    override fun bind(viewBinding: sobaya.app.myapplication.databinding.ItemBinding, position: Int) {
    }
}