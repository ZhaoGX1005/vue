<template>
  <el-menu
    :collapse="false"
    @open="handleOpen"
    @close="handleClose"
  >
    <el-menu-item v-for="item in noChildren" :index="item.path" :key="item.path">
      <template slot="title">
        <i :class="'el-icon'+ item.icon" />
        <span slot="title">{{item.label}}</span>
      </template>
    </el-menu-item>
    <el-submenu index="1">
      <template slot="title">
        <i class="el-icon-location" />
        <span slot="title">导航2</span>
      </template>
      <el-menu-item-group>
        <el-menu-item index="1-1">
          选项1~
        </el-menu-item>
        <el-menu-item index="1-2">
          选项2
        </el-menu-item>
      </el-menu-item-group>
    </el-submenu>
  </el-menu>
</template>
<script>
export default {
  data () {
    return {
      isCollapse: false,
      menu: [
        {
          path: '/',
          name: 'home',
          label: '首页',
          icon: 's-home',
          url: 'Home/Home'
        },
        {
          path: '/mall',
          name: 'mall',
          label: '商品管理',
          icon: 's-mall',
          url: 'MallManger/MallManger'
        },
        {
          path: '/user',
          name: 'user',
          label: '用户管理',
          icon: 's-user',
          url: 'User/User'
        },
        {
          label: '其他',
          icon: 'location',
          children: [
            {
              path: '/page1',
              name: 'page1',
              label: '页面1',
              icon: 'setting',
              url: 'Other/PageOne'
            },
            {
              path: '/page2',
              name: 'page2',
              label: '页面2',
              icon: 's-setting',
              url: 'Other/PageTwo'
            }
          ]
        }
      ],
      tradeData: [
        {
          path: '/',
          name: 'home',
          label: '首页',
          icon: 's-home',
          url: 'Home/Home'
        },
        {
          path: '/mall',
          name: 'mall',
          label: '商品管理',
          icon: 's-mall',
          url: 'MallManger/MallManger'
        }
      ]
    }
  },
  methods: {
    handleOpen (key, keyPath) {
      console.log(key, keyPath)
    },
    handleClose (key, keyPath) {
      console.log(key, keyPath)
    }
  },
  computed: {
    noChildren () {
      console.log(item => !item.children)
      return this.menu.filter(item => !item.children)
    },
    hasChildren () {
      return this.menu.filter(item => item.children)
    }
  }
}
</script>
<style>

</style>
