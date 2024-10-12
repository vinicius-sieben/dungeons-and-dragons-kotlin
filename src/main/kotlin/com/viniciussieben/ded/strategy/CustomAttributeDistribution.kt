package com.viniciussieben.ded.strategy

import com.viniciussieben.ded.model.Attribute
import com.viniciussieben.ded.model.Attributes

class CustomAttributeDistribution : AttributeDistribution {
    override fun distributeAttributes(points: Int): Attributes {

        return Attributes(
            strength = Attribute(10),
            dexterity = Attribute(10),
            constitution = Attribute(10),
            intelligence = Attribute(10),
            wisdom = Attribute(10),
            charisma = Attribute(10)
        )
    }
}